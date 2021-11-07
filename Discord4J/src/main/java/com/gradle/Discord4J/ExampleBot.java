package com.gradle.Discord4J;

import discord4j.common.util.Snowflake;
import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.event.domain.role.RoleCreateEvent;
import discord4j.core.object.command.ApplicationCommand;
import discord4j.core.object.entity.Message;
import discord4j.discordjson.json.ApplicationCommandData;
import discord4j.discordjson.json.ApplicationCommandOptionData;
import discord4j.discordjson.possible.Possible;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public final class ExampleBot {
    public static void main(final String[] args) {
        final String token = "OTA2ODQxNzc3NTc3ODIwMTcw.YYegOA.skF3mkMDsqP4dkzkaliREIE-ZbI";
        final DiscordClient client = DiscordClient.create(token);

        client.login().flatMapMany(gateway -> gateway.on(MessageCreateEvent.class))
                .map(MessageCreateEvent::getMessage)
                .filter(message -> "!ping".equals(message.getContent()))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage("Pong!"))
                .blockLast();

        //final RoleCreateEvent client1 = new RoleCreateEvent();
        final GatewayDiscordClient gateway = new GatewayDiscordClient(client, , );
        final ApplicationCommandData data = new ApplicationCommandData() {
            @Override
            public String id() {
                return null;
            }

            @Override
            public Possible<Integer> type() {
                return null;
            }

            @Override
            public String applicationId() {
                return null;
            }

            @Override
            public String name() {
                return null;
            }

            @Override
            public String description() {
                return null;
            }

            @Override
            public Possible<List<ApplicationCommandOptionData>> options() {
                return null;
            }

            @Override
            public Possible<Boolean> defaultPermission() {
                return null;
            }
        };

        final ApplicationCommand event = new ApplicationCommand(gateway,"$").getCommand(); // "$" -> data
        //event.getCommand();

        final Mono<ApplicationCommand> event2 = new Mono<ApplicationCommand>() {
            @Override
            public void subscribe(CoreSubscriber<? super ApplicationCommand> actual) {

            }
            public Mono<ApplicationCommand> getGuild() {

            }
        };

        final Optional<Snowflake> event3 = new Optional<>(){

        }

    }
}
